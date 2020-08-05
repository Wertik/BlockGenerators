package space.devport.wertik.blockgenerators.system.preset.struct;

import lombok.Data;
import space.devport.utils.item.Amount;
import space.devport.utils.item.ItemBuilder;

@Data
public class GeneratorPreset {

    private DynamicMaterial regenerateInto;

    private DynamicMaterial replaceBlock;

    private Amount regenDelay;

    private ItemBuilder item;
}