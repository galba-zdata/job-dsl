multibranchPipelineJob("unit-test") {
    branchSources {
        git {
            remote("https://github.com/galba-zdata/jenkins-test.git")
            includes('*')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
