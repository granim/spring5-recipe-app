package guru.springframework.controllers;

import guru.springframework.service.ImageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ImageController {

    private final ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @PostMapping("recipe/{id"/image")
    publice String handleImagePost(@PathVariable String  id, @requestParam("file") MultipartFile file) {
        imageService.saveImageFile(Long.valueOf(id), file);

        return "recipe/" + id + "/show";
    }

}
