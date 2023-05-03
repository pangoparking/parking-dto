package org.parking.model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Fine {

	public long ownerID;
	public String ownerName;
	public long carID;
	public String parkingPlace;
	public LocalDateTime dateTime;
	public float amountOfFine;
	public EnumStatus status;
	
}
