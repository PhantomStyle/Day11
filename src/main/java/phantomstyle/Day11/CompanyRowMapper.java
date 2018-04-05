package phantomstyle.Day11;

import org.springframework.jdbc.core.RowMapper;
import phantomstyle.Day11.domain.Company;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyRowMapper implements RowMapper<Company> {
    public Company mapRow(ResultSet resultSet, int i) throws SQLException {
        return new Company(resultSet.getLong("id"), resultSet.getString("name"));

    }
}
