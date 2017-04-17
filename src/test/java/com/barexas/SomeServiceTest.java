package com.barexas;

import com.barexas.configs.TestConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
// Указываем конкретный контекст
@SpringBootTest(classes = TestConfig.class)
// Выбираем профиль, будут загружаться проперти *название профиля*.properties
@ActiveProfiles("test-application")
public class SomeServiceTest {
    @Autowired
    private SomeService someService;

    @MockBean
    private SomeDAO someDAO;

    @Test
    public void action() throws Exception {
        someService.action();
        verify(someDAO, times(1)).repositoryAction();
    }

}