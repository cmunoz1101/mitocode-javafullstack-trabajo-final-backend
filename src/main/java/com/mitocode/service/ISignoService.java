/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitocode.service;

import com.mitocode.model.Signo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author cmunoz
 */
public interface ISignoService extends ICRUD<Signo, Integer>{
    
    Page<Signo> listarPageable(Pageable pageable);
    
}
