/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package practices.data;

/**
 * @author Toscaro
 */
@FunctionalInterface
public interface Rateable<T> {
    public static final Rating DEFAULT_RATING = Rating.NOT_RATED;

    public abstract T applyRating(Rating rating);

    public default T applyRating(int stars){
        return applyRating(convert(stars));
    }
    public default Rating getRating() {
        return DEFAULT_RATING;
    }

    public static Rating convert(int stars) {
        final Rating[] values = Rating.values();
        final int length = values.length;
        return (stars >=0 && stars < length) ? values[stars] : DEFAULT_RATING;
    }
}
