package orientedprogramming;

public class JOBS {
	private String job_name;
	private String job_group;
	private String job_tribe;

	public JOBS(String job_name, String job_group, String job_tribe) {

		this.job_name = job_name;
		this.job_group = job_group;
		this.job_tribe = job_tribe;

	}

	@Override
	public String toString() {
		return String.format("직업 : %s, 직업군 : %s, 종족 : %s ", job_name, job_group, job_tribe);
	}

}
