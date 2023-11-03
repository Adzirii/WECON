//package com.example.wecon.service;
//
//import com.example.wecon.entity.Promotion;
//import com.example.wecon.repository.PromotionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class PromotionService {
//    @Autowired
//    private PromotionRepository promotionRepository;
//
//    public Promotion addPromotion(Promotion promotion){
//        return promotionRepository.save(promotion);
//    }
//
//    private void delete(long id){
//        promotionRepository.deleteById(id);
//    }
//
//    public List<Promotion> findByInstitutionId(long id) {
//        return promotionRepository.findByInstitutionId(id);
//    }
//
//    public List<Promotion> findAll(){
//        return promotionRepository.findAll();
//    }
//
//}
