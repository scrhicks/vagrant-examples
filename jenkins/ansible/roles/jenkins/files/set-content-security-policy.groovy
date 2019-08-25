/*
   Configure the content security policy to be less strict so reports can be
   loaded.  This is necessary for reporting tools which embed unsafe inline
   JavaScript and CSS.
   By having an empty file in your local bootstrapper, this script will get
   overwritten by it and never execute.  Alternatively, you could copy this
   script to your local bootstrapper and customize the content security policy
   yourself.
   See also https://wiki.jenkins.io/display/JENKINS/Configuring+Content+Security+Policy
*/

import jenkins.model.Jenkins

System.setProperty("hudson.model.DirectoryBrowserSupport.CSP", "default-src 'self' ${(Jenkins.instance.rootUrl ?: 'http://localhost:8080') -~ '/$'} 'unsafe-inline'")
