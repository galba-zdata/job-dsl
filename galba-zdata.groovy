organizationFolder('galba-zdata') {
    description('This contains branch source jobs for Bitbucket and GitHub')
    displayName('galba-zdatar')
    triggers {
        periodic(86400)
    }
}
