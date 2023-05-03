package it.unibo.oop.lab.collections2;

import java.util.*;


/**
 * 
 * Instructions
 * 
 * This will be an implementation of
 * {@link it.unibo.oop.lab.collections2.SocialNetworkUser}:
 * 
 * 1) complete the definition of the methods by following the suggestions
 * included in the comments below.
 * 
 * @param <U>
 *            Specific user type
 */
public final class SocialNetworkUserImpl<U extends User> extends UserImpl implements SocialNetworkUser<U> {


	private Map<String, List<U>> map;

    /*
     * 
     * [FIELDS]
     * 
     * Define any necessary field
     * 
     * In order to save the people followed by a user organized in groups, adopt
     * a generic-type Map:
     * 
     * think of what type of keys and values would best suit the requirements
     */

    /*
     * [CONSTRUCTORS]
     * 
     * 1) Complete the definition of the constructor below, for building a user
     * participating in a social network, with 4 parameters, initializing:
     * 
     * - firstName - lastName - username - age and every other necessary field
     * 
     * 2) Define a further constructor where age is defaulted to -1
     */

    /**
     * Builds a new {@link SocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.map = new HashMap<>();

    }

    public SocialNetworkUserImpl(final String name, final String surname, final String user) {
        super(name, surname, user, -1);
        this.map = new HashMap<>();
    }
    
    @Override
    public Collection<U> getFollowedUsersInGroup(final String groupName) {
    	if (this.map.get(groupName) != null) {
    		Collection<U> coll = new ArrayList<>();
        	coll.addAll(this.map.get(groupName));
        	return coll;
    	}
    	return null;
    }

    @Override
    public List<U> getFollowedUsers() {
    	List<U> list = new ArrayList<>();
    	Set<String> set = this.map.keySet();
    	for (String s : set) {
    		list.addAll(this.map.get(s));
    	}
    	return list;
    }

	@Override
	public boolean addFollowedUser(String group, U user) {
		if (!this.map.containsKey(group)) {
			this.map.put(group, new ArrayList<>());
		}
		List<U> list = this.map.get(group);
		list.add(user);
		return true;
	}
	
	@Override
	public String toString() {
		return "SocialNetworkUserImpl [map=" + map + "]";
	}

}
