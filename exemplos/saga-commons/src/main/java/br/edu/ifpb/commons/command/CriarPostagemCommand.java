package br.edu.ifpb.commons.command;

import br.edu.ifpb.commons.domain.Postagem;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CriarPostagemCommand implements Comando<PostagemRequest, Long> {
    private PostagemRequest postagemRequest;

    @Override
    public PostagemRequest getAlvo() {
        return postagemRequest;
    }

}
