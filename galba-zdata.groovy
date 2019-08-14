  organizationFolder('galba-zdata') {
    description('This contains branch source jobs for example-org GitHub')
    displayName('example-org')
    triggers {
      periodic(2400)
    }
    organizations {
      github {
        repoOwner("galba-zdata")
        apiUri("https://api.github.com")
        traits {
          publicRepoPullRequestFilterTrait()
        }
      }
    }
  }
