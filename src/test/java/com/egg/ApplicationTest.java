package com.egg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

class ApplicationTest {

    @Test
    void createMockObject(){
        List<Integer> numerosMocked = mock(List.class);
        int tamanhoMock = numerosMocked.size();

        assertEquals(0, tamanhoMock);
    }

    @Test
    void configureMockObject2(){
        List<Integer> numerosMocked = mock(List.class);
        when(numerosMocked.size()).thenReturn(5);

        assertEquals(5, numerosMocked.size());
        verify(numerosMocked).size();
    }

    @Test
    void verificarMetodo(){
        List<Integer> numerosMocked = mock(List.class);
        numerosMocked.add(23);
        verify(numerosMocked).add(23);
    }

    @Test
    void crearObjetoEspia(){
        ArrayList<Integer> numerosSpy = spy(new ArrayList<Integer>());
        numerosSpy.add(45);
        verify(numerosSpy).add(45);
        assertEquals(1, numerosSpy.size());
    }
}
