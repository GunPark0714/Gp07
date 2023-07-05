package day26.library.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class BookRental {


	  private String num;
	  private String dayofrent;
	  private String returnSchedule;
	  private String dayofreturn;
}
