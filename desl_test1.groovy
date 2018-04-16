def jobname ="${jobname}"
job(jobname) {
    scm {
        git('https://github.com/kbhargavi123/antprojects.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
 jdk("java9")
    steps {
	    ant('jar')
       {
	    antInstallation '1.9.6'
		buildFile 'build.xml'
	}
 }
}
