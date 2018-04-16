def jobname ="${jobname}"
job(jobname) {
    scm {
        git('https://github.com/kbhargavi123/antprojects.git')
    }
    triggers {
        scm('H/15 * * * *')
    }

    steps {
	    ant('jar')
       {
	    antInstallation '1.9.6'
		buildFIle "build.xml"
	}
}
