package selfie.repository;


import selfie.model.SelfieResults;

public interface SelfieResultsRepository extends  AbstractRepository<SelfieResults,Long> {
    public SelfieResults getResultsByJobId(String jobId);
}
