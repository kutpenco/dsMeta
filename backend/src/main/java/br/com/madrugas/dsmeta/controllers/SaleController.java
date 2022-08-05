package br.com.madrugas.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.madrugas.dsmeta.entities.Sale;
import br.com.madrugas.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public List<Sale> findSales(){
		return saleService.findSales();
	}
	
	@GetMapping(value = "/dateall")
	public Page<Sale> findSalesDate(Pageable pageable){
		return saleService.findSalesDate(pageable);
	}
	
	@GetMapping(value = "/dateminmax")
	public Page<Sale> findSalesDateMinMax(@RequestParam (value="minDate", defaultValue = "") String minDate, @RequestParam (value="maxDate", defaultValue = "") String maxDate,  Pageable pageable){
		return saleService.findSalesDateMinMax(minDate, maxDate, pageable);
	}
}
