package com.eprern.seguridadpublica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.IOException;
import java.io.InputStreamReader;

@SpringBootApplication
public class SeguridadpublicaApplication {

	public static void main(String[] args) throws IOException {


        System.out.println(" ,---.                             ,--.   ,--.           ,--. ,------.         ,--.   ,--.,--.               \n" +
                "'   .-' ,---.  ,---.,--.,--.,--.--.`--' ,-|  | ,--,--. ,-|  | |  .--. ',--.,--.|  |-. |  |`--' ,---. ,--,--. \n" +
                "`.  `-.| .-. :| .-. |  ||  ||  .--',--.' .-. |' ,-.  |' .-. | |  '--' ||  ||  || .-. '|  |,--.| .--'' ,-.  | \n" +
                ".-'    \\   --.' '-' '  ''  '|  |   |  |\\ `-' |\\ '-'  |\\ `-' | |  | --' '  ''  '| `-' ||  ||  |\\ `--.\\ '-'  | \n" +
                "`-----' `----'.`-  / `----' `--'   `--' `---'  `--`--' `---'  `--'      `----'  `---' `--'`--' `---' `--`--' \n" +
                "              `---'                                                                                          ");


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");


        System.out.println("");
		SpringApplication.run(SeguridadpublicaApplication.class, args);
		System.out.println();

        System.out.println("                                            \n" +
                "  ,---.            ,--.                    \n" +
                " /  O  \\ ,--.,--.,-'  '-. ,---. ,--.--   .--. \n" +
                "|  .-.  ||  ||  |'-.  .-'| .-. ||  .--'   '--' \n" +
                "|  | |  |'  ''  '  |  |  ' '-' '|  |      .--. \n" +
                "`--' `--' `----'   `--'   `---' `--'      '--' ");

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("");
        System.out.println(",--.                     ,--.                                  ,---.           ,--.,--.\n" +
                "|  |    ,--,--.,--.,--.,-'  '-.,--,--.,--.--. ,---.           /  O  \\,--.  ,--.`--'|  | ,--,--. \n" +
                "|  |   ' ,-.  ||  ||  |'-.  .-' ,-.  ||  .--'| .-. |         |  .-.  |\\  `'  / ,--.|  |' ,-.  | \n" +
                "|  '--.\\ '-'  |'  ''  '  |  | \\ '-'  ||  |   ' '-'         ' |  | |  | \\    /  |  ||  |\\ '-'  | \n" +
                "`-----' `--`--' `----'   `--'  `--`--'`--'    `---'          `--' `--'  `--'   `--'`--' `--`--' ");


        System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("    Aplicacion corriendo Exitosamente   !!!");
		System.out.println("");
		System.out.println("------------------------------------------");





	}

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOriginPatterns("*")
						.allowedMethods("*")
						.allowedHeaders("*")
						.allowCredentials(true);
			}
		};
	}

}
