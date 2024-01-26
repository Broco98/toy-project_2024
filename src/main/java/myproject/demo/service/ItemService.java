package myproject.demo.service;

import lombok.RequiredArgsConstructor;
import myproject.demo.domain.item.Item;
import myproject.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    public Long save(Item item) {
        Item savedItem = itemRepository.save(item);
        return savedItem.getId();
    }

    public Item findById(Long id) {
        return itemRepository.findById(id);
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

}
