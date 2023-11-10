package host.luke.FoodIntellectuals.biz.service.impl;

import host.luke.FoodIntellectuals.biz.repository.FoodTagRepository;
import host.luke.FoodIntellectuals.biz.service.FoodTagService;
import host.luke.FoodIntellectuals.common.entity.FoodTag;
import java.util.List;

public class FoodTagServiceImpl implements FoodTagService {
  private final FoodTagRepository foodTagRepository;

  public FoodTagServiceImpl(FoodTagRepository foodTagRepository) {
    this.foodTagRepository = foodTagRepository;
  }

  @Override
  public List<FoodTag> findByFoodId(long foodId) {
    return foodTagRepository.findByFoodId(foodId);
  }

  @Override
  public FoodTag save(FoodTag foodTag) {
    return foodTagRepository.save(foodTag);
  }

  @Override
  public List<FoodTag> findByTagType(Integer tagType) {
    return foodTagRepository.findByTagType(tagType);
  }

  @Override
  public List<FoodTag> findByTagName(String tagName) {
    return foodTagRepository.findByTagName(tagName);
  }
}
