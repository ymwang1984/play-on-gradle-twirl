@(jsFile: String, payload: String)

(function() {
@*
 * Inject the PAYLOAD
 *@
var PAYLOAD = @JavaScript(payload);

@*
 * Inject the jsFile
 *@
@JavaScript(jsFile)
}());
