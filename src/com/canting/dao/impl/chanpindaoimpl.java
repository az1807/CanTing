package com.canting.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.canting.dao.chanpindao;
import com.canting.entity.chanpin;
import com.canting.util.DBManager;



	public class chanpindaoimpl implements chanpindao {

		public List<chanpin> querychanpins() {
			List<chanpin> pts = new ArrayList<chanpin>();

			ResultSet rs = DBManager.querySQL("select * from chanpin;");

			try {
				while (rs.next()) {
					chanpin pt = new chanpin();
					pt.setId(rs.getInt(1));
					pt.setName(rs.getString(2));
					pts.add(pt);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return pts;
		}

	}


