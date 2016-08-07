package in.ashwanthkumar.gocd.github.provider.gerrit;

import in.ashwanthkumar.gocd.github.settings.general.GeneralPluginConfigurationView;
import in.ashwanthkumar.gocd.github.util.FieldFactory;
import in.ashwanthkumar.gocd.github.util.field.Required;
import in.ashwanthkumar.gocd.github.util.field.Secure;

import java.util.HashMap;
import java.util.Map;

public class GerritPluginConfigurationView implements GeneralPluginConfigurationView {


    @Override
    public String templateName() {
        return "/views/plugin.template.html";
    }

    @Override
    public Map<String, Object> fields() {
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("go_api_host", FieldFactory.createForGeneral("Go API Host", null, Required.NO, Secure.NO, 0));
        response.put("go_api_username", FieldFactory.createForGeneral("Go Username", null, Required.NO, Secure.NO, 1));
        response.put("go_api_password", FieldFactory.createForGeneral("Go Password", null, Required.NO, Secure.YES, 2));
        return response;
    }

    @Override
    public boolean hasConfigurationView() {
        return true;
    }
}
