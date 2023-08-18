pipeline {
    agent any

    parameters {
        extendedChoice(
            name: 'SELECTED_ENVIRONMENTS',
            type: 'PT_CHECKBOX',
            visibleItemCount: 3,
            multiSelectDelimiter: ',',
            propertyFile: "C:\Users\Vegeta\AppData\Local\Jenkins\.jenkins\workspace\Test\env.properties",
            propertyKey: 'test',
            description: 'Select up to 3 environments'
        )
    }

    stages {
        stage('Checkout') {
            steps {
                 bat" dir"
            }
        }
        stage('Build') {
            steps {
                script{
            echo " $SELECTED_ENVIRONMENTS"
                }
            }
        }
    }
}
