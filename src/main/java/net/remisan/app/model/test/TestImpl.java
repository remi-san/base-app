package net.remisan.app.model.test;

public class TestImpl implements Test {
    
    private static final long serialVersionUID = 1L;
    
    protected Long id;
    protected String name;

    public TestImpl(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public boolean isNew() {
        return false;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
