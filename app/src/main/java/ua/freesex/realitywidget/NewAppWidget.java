package ua.freesex.realitywidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.widget.RemoteViews;

import java.util.Random;


/**
 * Implementation of App Widget functionality.
 */
public class NewAppWidget extends AppWidgetProvider {

    private static RemoteViews views;
    private Context context;
    private Random r;

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {
        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        final int N = appWidgetIds.length;
        for (int i = 0; i < N; i++) {
            updateAppWidget(context, appWidgetManager, appWidgetIds[i]);
        }
    }

    public void onEnabled(Context context, AppWidgetManager appWidgetManager, int appWidgetID) {
        // Enter relevant functionality for when the first widget is created

        views = new RemoteViews(context.getPackageName(), R.layout.new_app_widget);
        r = new Random();
        int[] frases = {
                R.string.wp1, R.string.wp2, R.string.wp3, R.string.wp4, R.string.wp5,
                R.string.wp6, R.string.wp7, R.string.wp8, R.string.wp9, R.string.wp10
        };
        int pos = r.nextInt(frases.length);
        views.setTextViewText(R.id.doi, "" + pos);
        updateAppWidget(context, appWidgetManager, appWidgetID);

    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}

