pipelineJob('pipelineJob'){
    definition{
        cps{
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('saree-customer-app-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/manjunathnbec/saree-customer-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}