// imports
import jenkins.model.*
import hudson.util.*;
import jenkins.install.*;

// parameters
def jenkinsParameters = [
  email:  'Jenkins Admin <admin@jenkins.com>',
  url:    'http://172.31.31.10:8080/'
]

// get Jenkins location configuration
def jenkinsLocationConfiguration = JenkinsLocationConfiguration.get()

// set Jenkins URL
jenkinsLocationConfiguration.setUrl(jenkinsParameters.url)

// set Jenkins admin email address
jenkinsLocationConfiguration.setAdminAddress(jenkinsParameters.email)

// save current Jenkins state to disk
jenkinsLocationConfiguration.save()