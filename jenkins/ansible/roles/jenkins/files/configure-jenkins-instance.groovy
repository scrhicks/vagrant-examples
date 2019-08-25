// imports
import jenkins.model.*
import hudson.util.*;
import jenkins.install.*;

// parameters
def jenkinsParameters = [
  labels: 'master',
  numberOfExecutors: 1,
  qiuetPeriod: 10,
  setScmCheckoutRetryCount: 5,
  setSystemMessage: 'My custom system message'
]

// sey system message
Jenkins.instance.setSystemMessage(jenkinsParameters.setSystemMessage)

// set Master Labels
Jenkins.instance.setLabelString(jenkinsParameters.labels)

// set number of executors
Jenkins.instance.setNumExecutors(jenkinsParameters.numberOfExecutors)

// set quiet period
Jenkins.instance.setQuietPeriod(jenkinsParameters.qiuetPeriod)

// set SCM checkout retry count
Jenkins.instance.setScmCheckoutRetryCount(jenkinsParameters.setScmCheckoutRetryCount)

// save to disk
Jenkins.instance.save()