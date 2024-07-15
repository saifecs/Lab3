package ca.ucalgary.ensf380;

public class Category {
    private Category subCategory;
    private Category superCategory;
    private String category;
    public String sort() {
    	return "Method sort called from Category";
    }
	public Category getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(Category subCategory) {
		this.subCategory = subCategory;
	}
	public Category getSuperCategory() {
		return superCategory;
	}
	public void setSuperCategory(Category superCategory) {
		this.superCategory = superCategory;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
}
