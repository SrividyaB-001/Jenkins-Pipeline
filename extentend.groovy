pipeline {
    agent any

    parameters {
        extendedChoice(
            name: 'SELECTED_ENVIRONMENTS',
            type: 'PT_CHECKBOX',
            visibleItemCount: 3,
            multiSelectDelimiter: ',',
            propertyFile: env.properties,
            propertyKey: 'dev',
            description: 'Select up to 6 environments'
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
                // Your build steps here, using the "SELECTED_ENVIRONMENTS" parameter
            }
        }
    }
}
