# AeroGear Integration Tests Server

## API

### Pipe

#### GET /rest/team/developers

Retrieve list of team developers

```
curl -v \
     -H "Accept: application/json" \
     -H "Content-type: application/json" \
     -X GET http://localhost:8080/aerogear-integration-tests-server/rest/team/developers
```


#### POST /rest/upload

Handles a multipart request by simply echoing backs to the client the values posted. For file objects, it echoes the overall size of the file.

**NOTE** files are not persisted on disk.

```
curl -v 
	 -F "somekey=somevalue" \
	 -F "file=@/path/to/a/filename" 
	 http://localhost:8080/aerogear-integration-tests-server/rest/upload
```

will return a JSON object of a form:

```
{"filename":"<file length>","somekey":"somevalue"}
```