package ru.medcoresoft;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static ru.medcoresoft.HibernateDb.GetPatient;

/**
 * Created by vdorofeyev on 4/3/2014.
 */
public class HibernateDbTest {
    @Test
    public void testGetPatient() throws Exception {
PatientEntity patientEntity = GetPatient("1");
  assertNotNull("!", patientEntity);
    }
}
