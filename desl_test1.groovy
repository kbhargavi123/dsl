<<<<<<< HEAD:desl-test1.groovy
def jobname="${jobname}"

=======
def jobname ="${jobName}_sh"
>>>>>>> 0f5bbb9b8f2080cf923064c8338a58e27d40a13f:desl_test1.groovy
job(jobname) {
    scm {
        git('https://github.com/kbhargavi123/antprojects.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
	
    steps {
	     
<<<<<<< HEAD:desl-test1.groovy
       ant('jar')
       {
	    antInstallation '1.9.6'
		buildFIle "build.xml"
	   
       }
}
=======
       shell('pwd')
    }
}
>>>>>>> 0f5bbb9b8f2080cf923064c8338a58e27d40a13f:desl_test1.groovy
