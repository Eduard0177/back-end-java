package com.aos.aula02.demo.service;

@Service
public class EditoraService {

        @Autowired
        private EditoraRepository editoraRepository;
    
        public void inserirEditora(Editora editora) {
            editoraRepository.save(editora);
        }
    
        // Buscar
    
        public List<editora> buscarTodasEditora() {
            return editoraRepository.findAll();
        }
    
        public Editora buscarPeloId(Long id) {
            return editoraRepository.findById(id);
        }
    
        public List<Editora> buscarPeloNome(String nome) {
            return editoraRepository.findByNome(nome);
        }
    
        public Editora buscarPeloCNPJ(String CNPJ) {
            return editoraRepository.findByCNPJ(CNPJ);
        }
    
    
        // DELETE
    
        public void deletaeditora(Editora editora) {
            editoraRepository.delete(editora);
        }
    
        public void deletaPeloId(Long id) {
            editoraRepository.deleteById(id);
        }
    
        public void deletePeloNome(String nome) {
                editoraRepository.deleteByNome(editora);
            }
    
        public void deletePeloCNPJ(String CNPJ) {
                editoraRepository.deleteByCNPJ(CNPJ);
            }
}

