public class GenericServlet<Serializable> {
    package javax.servlet;
    import ...
    public abstract classGenericServlet implements Servlet,servletConfig,Serializable{
        private static final long serialVersionUID = 1L;
        private transient ServletConfig config;

        public GenericServlet(){

        }
    }
}
