Sample with Json file that where given in task is stored in path 'com/example/jsonSample/jsonSample.json' and assumed as one with correct data.
Files 'com/example/jsonSample/secondSample.json' and 'com/example/jsonSample/thirdSample.json'
stores invalid values for 'unid', 'emailAddress' and 'phoneNumber' fields.

From the sample file validity for fields 'unid', 'emailAddress' and 'phoneNumber' is defined with next regexp:

unid         - (^\\d{7})$
emailAddress - ^(.*)@wolterskluwer.com$
phoneNumber  - ^\\d{1}-\\d{3}-\\d{3}-\\d{4}$
