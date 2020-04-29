# Rest-Web-Service

if need xml format rest web service than add dependency "jackson dataformat xml".

if we want to send only xml/json based web service then

        @RequestMapping(path = "/", produces={"application/xml"})

if we want to accept only xml/json based web service then

        @RequestMapping(path = "/", consumes={"application/xml"})
        
Note that, if we add "jackson dataformat xml" dependency in our pom.xml file,
then our rest web service will support initially both xml and json format.
