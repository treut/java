public enum Enama {
    ONE("onanan"), TWO("twatata"), THREE("trototo");

    private String content;
    Enama(String content){
        this.content=content;
    }

    public String getContent(){
        return content;
    }

    public String toString(){
        return "Content: "+content;
    }
}
