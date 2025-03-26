package co.edu.univalle.pedidoservice;

public record Pedido(String id, ProductoDTO producto, int cantidad) {}
