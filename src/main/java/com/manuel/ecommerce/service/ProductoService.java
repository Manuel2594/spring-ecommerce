package com.manuel.ecommerce.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.manuel.ecommerce.model.Producto;

@Service
public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);

}
