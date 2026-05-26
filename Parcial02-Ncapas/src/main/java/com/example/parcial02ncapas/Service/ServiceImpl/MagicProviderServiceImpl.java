package com.example.parcial02ncapas.Service.ServiceImpl;

import com.example.parcial02ncapas.Model.DTOs.MagicProviderDTO;
import com.example.parcial02ncapas.Model.Entity.MagicProvider;
import com.example.parcial02ncapas.Repository.iMagicProviderRepository;
import com.example.parcial02ncapas.Service.iMagicProviderService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MagicProviderServiceImpl implements iMagicProviderService {

    private final iMagicProviderRepository mgRep;

    @Override
    public MagicProviderDTO registrarProveedor(MagicProviderDTO mpDTO) {

        MagicProvider mgToDatabase = MagicProvider.builder()
                .name(mpDTO.getName())
                .build();

        mgRep.save(mgToDatabase);
        return mpDTO;
    }
}
