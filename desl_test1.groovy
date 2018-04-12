def jobname ="${jobName}_sh"
job(jobname) {
    scm {
        git('git://github.com/quidryan/aws-sdk-test.git')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
	     
       sh 'pwd'
    }
}
