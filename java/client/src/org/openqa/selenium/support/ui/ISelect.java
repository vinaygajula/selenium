package org.openqa.selenium.support.ui;

import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by evgeniyat on 13.05.16
 *
 * ISelect interface makes a protocol for all kind of select elements (standard html and custom
 * model)
 */
public interface ISelect {

  /**
   * @return Whether this select element support selecting multiple options at the same time? This
   * is done by checking the value of the "multiple" attribute.
   */
  public boolean isMultiple();

  /**
   * @return All options belonging to this select tag
   */
  public List<WebElement> getOptions();

  /**
   * @return All selected options belonging to this select tag
   */
  public List<WebElement> getAllSelectedOptions();

  /**
   * @return The first selected option in this select tag (or the currently selected option in a
   * normal select)
   */
  public WebElement getFirstSelectedOption();

  /**
   * Select all options that display text matching the argument. That is, when given "Bar" this
   * would select an option like:
   *
   * &lt;option value="foo"&gt;Bar&lt;/option&gt;
   *
   * @param text The visible text to match against
   */
  public void selectByVisibleText(String text);

  /**
   * Select the option at the given index. This is done by examining the "index" attribute of an
   * element, and not merely by counting.
   *
   * @param index The option at this index will be selected
   */
  public void selectByIndex(int index);

  /**
   * Select all options that have a value matching the argument. That is, when given "foo" this
   * would select an option like:
   *
   * &lt;option value="foo"&gt;Bar&lt;/option&gt;
   *
   * @param value The value to match against
   */
  public void selectByValue(String value);

  /**
   * Clear all selected entries. This is only valid when the SELECT supports multiple selections.
   */
  public  void deselectAll();

  /**
   * Deselect all options that have a value matching the argument. That is, when given "foo" this
   * would deselect an option like:
   *
   * &lt;option value="foo"&gt;Bar&lt;/option&gt;
   *
   * @param value The value to match against
   */
  public void deselectByValue(String value);

  /**
   * Deselect the option at the given index. This is done by examining the "index" attribute of an
   * element, and not merely by counting.
   *
   * @param index The option at this index will be deselected
   */
  public void deselectByIndex(int index);

  /**
   * Deselect all options that display text matching the argument. That is, when given "Bar" this
   * would deselect an option like:
   *
   * &lt;option value="foo"&gt;Bar&lt;/option&gt;
   *
   * @param text The visible text to match against
   */
  public void deselectByVisibleText(String text);
}