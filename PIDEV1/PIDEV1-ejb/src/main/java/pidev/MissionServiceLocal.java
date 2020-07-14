package pidev;

import java.util.List;

import javax.ejb.Local;

import entities.Mission;

@Local
public interface MissionServiceLocal {
	public Mission create(Mission mission);
	public Mission read(Long mission_id);
	public Mission update(Mission mission);
	public boolean delete(Mission mission);
	public List<Mission> getAll();
	public List<Mission> getAllByUser(Long user_id);
}
