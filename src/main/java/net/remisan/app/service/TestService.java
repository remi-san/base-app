package net.remisan.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;

import net.remisan.app.model.test.Test;
import net.remisan.app.model.test.TestImpl;
import net.remisan.base.service.Service;


@org.springframework.stereotype.Service
public class TestService implements Service<Test> {

    @Override
    public Test getById(Long id) {
        return new TestImpl(id, "test");
    }

    @Override
    public Test getByIdEager(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Test get(Specification<Test> specification) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Test> getByIds(List<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Test> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Test> getAll(Specification<Test> specification) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Page<Test> getAll(Specification<Test> specification, Pageable pageable) {
        List<Test> tests = new ArrayList<Test>();
        tests.add(this.getById(1L));
        return new PageImpl<Test>(tests);
    }

    @Override
    public List<Test> getAll(Specification<Test> specification, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count(Specification<Test> spec) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Test save(Test obj) throws BindException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Test> List<S> save(Iterable<S> entities)
            throws BindException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Test obj) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Test getPersistable(Test obj) throws InstantiationException,
            IllegalAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Test getNewInstance() throws InstantiationException,
            IllegalAccessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Errors validate(Test entity) {
        // TODO Auto-generated method stub
        return null;
    }

}
