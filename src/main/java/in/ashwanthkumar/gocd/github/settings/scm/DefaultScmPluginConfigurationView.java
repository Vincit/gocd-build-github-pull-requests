package in.ashwanthkumar.gocd.github.settings.scm;

import in.ashwanthkumar.gocd.github.util.BranchFilter;
import in.ashwanthkumar.gocd.github.util.FieldFactory;
import in.ashwanthkumar.gocd.github.util.field.PartOfIdentity;
import in.ashwanthkumar.gocd.github.util.field.Required;
import in.ashwanthkumar.gocd.github.util.field.Secure;

import java.util.HashMap;
import java.util.Map;

public class DefaultScmPluginConfigurationView implements ScmPluginConfigurationView {


    @Override
    public String templateName() {
        return "/views/scm.template.html";
    }

    @Override
    public Map<String, Object> fields() {
        Map<String, Object> response = new HashMap<String, Object>();
        response.put("url", FieldFactory.createForScm("URL", null, PartOfIdentity.YES, Required.YES, Secure.NO, 0));
        response.put("username", FieldFactory.createForScm("Username", null, PartOfIdentity.NO, Required.NO, Secure.NO, 1));
        response.put("password", FieldFactory.createForScm("Password", null, PartOfIdentity.NO, Required.NO, Secure.YES, 2));
        response.put("pipeline_name", FieldFactory.createForScm("Pipeline name", null, PartOfIdentity.NO, Required.NO, Secure.NO, 3));
        return response;
    }

    @Override
    public BranchFilter getBranchFilter(ScmPluginSettings scmSettings) {
        return new BranchFilter();
    }

    @Override
    public boolean hasConfigurationView() {
        return true;
    }

    public ScmPluginSettings getSettings(Map<String, String> rawSettings) {
        ScmPluginSettings settings = new DefaultScmPluginSettings(
                rawSettings.get("url"),
                rawSettings.get("username"),
                rawSettings.get("password"),
                null,
                rawSettings.get("pipeline_name")
        );

        return settings;
    }
}
