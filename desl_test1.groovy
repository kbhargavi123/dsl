def jobname ="${jobname}"
job(jobname) {
    scm {
        git('https://github.com/kbhargavi123/antprojects.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
 jdk("Java9")
    steps {
	    ant('jar')
       {
	    antInstallation 'ant installation'
		buildFile 'build.xml'
	}
 }
	publishers {
		archiveArtifacts "lib/helloworld.jar"
	}
}
