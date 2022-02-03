// verifies that the value in the field or property is not null.
@NotNull
private String itemName;

// verifies that the value in the field or property is null.
@Null
private String comments;

// verifies that the size of the field is between the min and max including the boundary values
@Size (min=3, max=40)
private String name;

// verifies that the value in the field or property is greater than or equal to the value defined in the Min. The value is a required element of the long type.
@Min(100)
private int minStock;

// annotation verifies that the value in the field or property is lesser than or equal to the value defined in the Max. The value is a required element of the long type. 
@Max(1000)
private int maxStock;

// annotation verifies the precision and scale of the field. The field must be a number within the specified range.The range is defined by the integer and the fraction elements. An integer and the fraction are required elements of an int type.
@Digits (integer=7, fraction=2)
private double monthlySale;

// verifies if the value in the field or property is a decimal value greater than or equal to the value defined in the DecimalMin. The value is a required element of the String type.
@DecimalMin("8.5")
private double minTax;

// verifies if the value in the field or property is a decimal value lesser than or equal to the value defined in the DecimalMax. The value is a required element of the String type.
@DecimalMax("19.5")
private double maxTax;

// verifies if the value in the field or property is a date in the future.
@Future
private Date promotionDate;

// verifies if the value in the field or property is a date in the past.
@Past
private Date startDate;

// verifies if the value in the field or property matches the regexp expression. The regular expression is a required element of the String type
@Pattern (regexp="\\(\\d{3}\\)\\d{3}-\\d{4}")
private String phoneNumber;

// verifies if the value in the field or property is false.
@AssertFalse
private boolean isAvailable;

// verifies if the value in the field or property is true.
@AssertTrue
private boolean isOrdered;