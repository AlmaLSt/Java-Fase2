public class AnalysisLibrary {
    public void analyzeInformation(String json) throws Exception{
        if(!validateJson(json)){
            throw new Exception("Information does not have JSON format");
        }
        System.out.println("Processing infomation...");
    }
    public boolean validateJson(String json){
        return true;
    }
}