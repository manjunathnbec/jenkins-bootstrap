pipeline{
    agent any{
        stages{
            stage('BUILD'){
                steps{
                    echo 'BUILD STAGE'
                }

            }
            stage('TEST'){
                steps{
                    echo 'TEST STAGE'
                }

            }

        }
    }
}