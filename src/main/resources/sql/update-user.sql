ALTER TABLE credentials.users ADD COLUMN user_first_name character varying(255);
ALTER TABLE credentials.users ADD COLUMN user_last_name character varying(255);
ALTER TABLE credentials.users ADD COLUMN user_address character varying(255);
ALTER TABLE credentials.users ADD COLUMN user_address2 character varying(255);
ALTER TABLE credentials.users ADD COLUMN user_city_name character varying(150);
ALTER TABLE credentials.users ADD COLUMN user_postal_code character varying(15);
ALTER TABLE credentials.users ADD COLUMN user_country_name character varying(150);
